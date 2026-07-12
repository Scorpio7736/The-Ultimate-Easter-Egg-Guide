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
import com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData.NonPlayer_Characters;
import com.example.the_ultimate_easter_egg_guide.Storyline.CodZombiesYoutubersData.CodZombies_Youtubers;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.ICharacter;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.NonPlayer_CharacterGroup;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.Player_CharacterGroup;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.YoutuberGroups;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.StorylineItems;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.List;

public class StorylineCharacterAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_CHARACTER = 1;

    private final List<Object> items = new ArrayList<>();
    private final OnCharacterClickListener listener;

    public interface OnCharacterClickListener {
        void onPlayerCharacterClick(Player_Characters character);
        void onNonPlayerCharacterClick(NonPlayer_Characters character);
        void onYoutuberClick(CodZombies_Youtubers youtuber);
    }

    public StorylineCharacterAdapter(StorylineItems category, boolean enableTesting, OnCharacterClickListener listener) {
        this.listener = listener;

        if (category == StorylineItems.Youtubers) {
            setupYoutuberItems(enableTesting);
        } else {
            setupCharacterItems(category, enableTesting);
        }
    }

    private void setupCharacterItems(StorylineItems category, boolean enableTesting) {
        if (category == StorylineItems.PlayerCharacter) {
            for (Player_CharacterGroup group : Player_CharacterGroup.values()) {
                if (enableTesting) {
                    if (group != Player_CharacterGroup.TEST) continue;
                } else {
                    if (group == Player_CharacterGroup.TEST) continue;
                }

                List<Object> charactersInGroup = new ArrayList<>();
                for (Player_Characters character : Player_Characters.values()) {
                    if (character.playerCharacterGroup == group) {
                        charactersInGroup.add(character);
                    }
                }

                if (!charactersInGroup.isEmpty()) {
                    items.add(group);
                    items.addAll(charactersInGroup);
                }
            }
        } else if (category == StorylineItems.NonPlayerCharacter) {
            for (NonPlayer_CharacterGroup group : NonPlayer_CharacterGroup.values()) {
                if (enableTesting) {
                    if (group != NonPlayer_CharacterGroup.TEST) continue;
                } else {
                    if (group == NonPlayer_CharacterGroup.TEST) continue;
                }

                List<Object> charactersInGroup = new ArrayList<>();
                for (NonPlayer_Characters character : NonPlayer_Characters.values()) {
                    if (character.nonPlayerCharacterGroup == group) {
                        charactersInGroup.add(character);
                    }
                }

                if (!charactersInGroup.isEmpty()) {
                    items.add(group);
                    items.addAll(charactersInGroup);
                }
            }
        }
    }

    private void setupYoutuberItems(boolean enableTesting) {
        for (YoutuberGroups group : YoutuberGroups.values()) {
            if (enableTesting) {
                if (group != YoutuberGroups.TEST) continue;
            } else {
                if (group == YoutuberGroups.TEST) continue;
            }

            List<Object> youtubersInGroup = new ArrayList<>();
            for (CodZombies_Youtubers youtuber : CodZombies_Youtubers.values()) {
                if (youtuber.youtuberGroup == group) {
                    youtubersInGroup.add(youtuber);
                }
            }

            if (!youtubersInGroup.isEmpty()) {
                items.add(group);
                items.addAll(youtubersInGroup);
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        Object item = items.get(position);
        return (item instanceof Player_CharacterGroup || item instanceof NonPlayer_CharacterGroup || item instanceof YoutuberGroups) ? TYPE_HEADER : TYPE_CHARACTER;
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
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Object item = items.get(position);

        if (holder instanceof HeaderViewHolder) {
            String displayName = "";
            if (item instanceof Player_CharacterGroup) {
                displayName = ((Player_CharacterGroup) item).displayName;
            } else if (item instanceof NonPlayer_CharacterGroup) {
                displayName = ((NonPlayer_CharacterGroup) item).displayName;
            } else if (item instanceof YoutuberGroups) {
                displayName = ((YoutuberGroups) item).displayName;
            }
            ((HeaderViewHolder) holder).groupName.setText(displayName);

        } else if (holder instanceof CharacterViewHolder) {
            CharacterViewHolder charHolder = (CharacterViewHolder) holder;
            if (item instanceof ICharacter) {
                ICharacter character = (ICharacter) item;
                charHolder.pfpImage.setImageResource(character.getCharacterImage());
                charHolder.nameText.setText(character.getCharacterName());
                charHolder.itemView.setOnClickListener(v -> {
                    if (listener != null) {
                        if (character instanceof Player_Characters) {
                            listener.onPlayerCharacterClick((Player_Characters) character);
                        } else if (character instanceof NonPlayer_Characters) {
                            listener.onNonPlayerCharacterClick((NonPlayer_Characters) character);
                        }
                    }
                });
            } else if (item instanceof CodZombies_Youtubers) {
                CodZombies_Youtubers youtuber = (CodZombies_Youtubers) item;
                charHolder.pfpImage.setImageResource(youtuber.characterImage);
                charHolder.nameText.setText(youtuber.channelName);
                charHolder.itemView.setOnClickListener(v -> {
                    if (listener != null) listener.onYoutuberClick(youtuber);
                });
            }
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
