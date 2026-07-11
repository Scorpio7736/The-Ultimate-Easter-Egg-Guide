package com.example.the_ultimate_easter_egg_guide.Helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData.Player_Characters;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CharacterGroup;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.List;

public class StorylineCharacterAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_CHARACTER = 1;

    private final List<Object> items = new ArrayList<>();
    private final OnCharacterClickListener listener;

    public interface OnCharacterClickListener {
        void onCharacterClick(Player_Characters character);
    }

    public StorylineCharacterAdapter(boolean enableTesting, OnCharacterClickListener listener) {
        this.listener = listener;
        for (CharacterGroup group : CharacterGroup.values()) {
            if (enableTesting) {
                if (group != CharacterGroup.TEST) continue;
            } else {
                if (group == CharacterGroup.TEST) continue;
            }

            List<Player_Characters> playerCharactersInGroup = new ArrayList<>();

            for (Player_Characters character : Player_Characters.values()) {
                if (character.characterGroup == group) {
                    playerCharactersInGroup.add(character);
                }
            }

            if (!playerCharactersInGroup.isEmpty()) {
                items.add(group);
                items.addAll(playerCharactersInGroup);
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position) instanceof CharacterGroup ? TYPE_HEADER : TYPE_CHARACTER;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (viewType == TYPE_HEADER) {
            View view = inflater.inflate(R.layout.character_group_header, parent, false);
            return new HeaderViewHolder(view);
        } else {
            View view = inflater.inflate(R.layout.character_cell, parent, false);
            return new CharacterViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(
            @NonNull RecyclerView.ViewHolder holder,
            int position
    ) {
        Object item = items.get(position);

        if (holder instanceof HeaderViewHolder) {
            CharacterGroup group = (CharacterGroup) item;
            ((HeaderViewHolder) holder).groupName.setText(group.displayName);

        } else if (holder instanceof CharacterViewHolder) {
            Player_Characters character = (Player_Characters) item;
            ((CharacterViewHolder) holder).pfpImage.setImageResource(
                    character.characterImage
            );
            ((CharacterViewHolder) holder).nameText.setText(
                    character.characterName
            );
            
            holder.itemView.setOnClickListener(v -> {
                if (listener != null) {
                    listener.onCharacterClick(character);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public GridLayoutManager.SpanSizeLookup getSpanSizeLookup() {
        return new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return getItemViewType(position) == TYPE_HEADER ? 2 : 1;
            }
        };
    }

    static class HeaderViewHolder extends RecyclerView.ViewHolder {
        TextView groupName;
        HeaderViewHolder(View itemView) {
            super(itemView);
            groupName = itemView.findViewById(R.id.group_name_text);
        }
    }

    static class CharacterViewHolder extends RecyclerView.ViewHolder {
        ImageView pfpImage;
        TextView nameText;
        CharacterViewHolder(View itemView) {
            super(itemView);
            pfpImage = itemView.findViewById(R.id.character_pfp_image);
            nameText = itemView.findViewById(R.id.character_name_text);
        }
    }
}
