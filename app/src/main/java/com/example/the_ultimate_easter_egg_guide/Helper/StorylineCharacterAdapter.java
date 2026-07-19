package com.example.the_ultimate_easter_egg_guide.Helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData.Player_Characters;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData.NonPlayer_Characters;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CreaturesData.Enemy_Creatures;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CreaturesData.Friendly_Creatures;
import com.example.the_ultimate_easter_egg_guide.StorylineData.OrganizationsData.Organizations;
import com.example.the_ultimate_easter_egg_guide.StorylineData.ItemsData.Items;
import com.example.the_ultimate_easter_egg_guide.StorylineData.MapsData.StorylineMaps;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CodZombiesYoutubersData.CodZombies_Youtubers;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.NonPlayer_CharacterGroups;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.Player_CharacterGroups;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CreatureGroups;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.ItemGroups;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.YoutuberGroups;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.StorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.Games;
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
        void onEnemyCreatureClick(Enemy_Creatures creature);
        void onFriendlyCreatureClick(Friendly_Creatures creature);
        void onGroupClick(Organizations group);
        void onItemClick(Items item);
        void onMapClick(StorylineMaps map);
        void onYoutuberClick(CodZombies_Youtubers youtuber);
    }

    public StorylineCharacterAdapter(StorylineItems category, boolean enableTesting, OnCharacterClickListener listener) {
        this(category, enableTesting, null, null, listener);
    }

    public StorylineCharacterAdapter(StorylineItems category, boolean enableTesting, Games gameFilter, OnCharacterClickListener listener) {
        this(category, enableTesting, gameFilter, null, listener);
    }

    public StorylineCharacterAdapter(StorylineItems category, boolean enableTesting, Games gameFilter, ItemGroups itemGroupFilter, OnCharacterClickListener listener) {
        this.listener = listener;

        if (category == StorylineItems.Youtubers) {
            setupYoutuberItems(enableTesting);
        } else if (category == StorylineItems.Creatures) {
            setupCreatureItems(enableTesting, gameFilter);
        } else if (category == StorylineItems.Organizations) {
            setupGroupItems(enableTesting, gameFilter);
        } else if (category == StorylineItems.Items) {
            setupItemItems(enableTesting, gameFilter, itemGroupFilter);
        } else if (category == StorylineItems.Map) {
            setupMapItems(enableTesting, gameFilter);
        } else {
            setupCharacterItems(category, enableTesting, gameFilter);
        }
    }

    private void setupCharacterItems(StorylineItems category, boolean enableTesting, Games gameFilter) {
        if (category == StorylineItems.PlayerCharacter) {
            for (Player_CharacterGroups group : Player_CharacterGroups.values()) {
                if (enableTesting) {
                    if (group != Player_CharacterGroups.TEST) continue;
                } else {
                    if (group == Player_CharacterGroups.TEST) continue;
                }

                List<Object> charactersInGroup = new ArrayList<>();
                for (Player_Characters character : Player_Characters.values()) {
                    if (character.playerCharacterGroup == group) {
                        if (gameFilter == null || character.gamesList.contains(gameFilter)) {
                            charactersInGroup.add(character);
                        }
                    }
                }

                if (!charactersInGroup.isEmpty()) {
                    items.add(group);
                    items.addAll(charactersInGroup);
                }
            }
        } else if (category == StorylineItems.NonPlayerCharacter) {
            for (NonPlayer_CharacterGroups group : NonPlayer_CharacterGroups.values()) {
                if (enableTesting) {
                    if (group != NonPlayer_CharacterGroups.TEST) continue;
                } else {
                    if (group == NonPlayer_CharacterGroups.TEST) continue;
                }

                List<Object> charactersInGroup = new ArrayList<>();
                for (NonPlayer_Characters character : NonPlayer_Characters.values()) {
                    if (character.nonPlayerCharacterGroup == group) {
                        if (gameFilter == null || character.gamesList.contains(gameFilter)) {
                            charactersInGroup.add(character);
                        }
                    }
                }

                if (!charactersInGroup.isEmpty()) {
                    items.add(group);
                    items.addAll(charactersInGroup);
                }
            }
        }
    }

    private void setupCreatureItems(boolean enableTesting, Games gameFilter) {
        for (CreatureGroups group : CreatureGroups.values()) {
            if (enableTesting) {
                if (group != CreatureGroups.TEST) continue;
            } else {
                if (group == CreatureGroups.TEST) continue;
            }

            List<Object> creaturesInGroup = new ArrayList<>();
            for (Enemy_Creatures creature : Enemy_Creatures.values()) {
                if (creature.creatureGroup == group) {
                    if (gameFilter == null || creature.gamesList.contains(gameFilter)) {
                        creaturesInGroup.add(creature);
                    }
                }
            }

            for (Friendly_Creatures creature : Friendly_Creatures.values()) {
                if (creature.creatureGroup == group) {
                    if (gameFilter == null || creature.gamesList.contains(gameFilter)) {
                        creaturesInGroup.add(creature);
                    }
                }
            }

            if (!creaturesInGroup.isEmpty()) {
                items.add(group);
                items.addAll(creaturesInGroup);
            }
        }
    }

    private void setupGroupItems(boolean enableTesting, Games gameFilter) {
        List<Object> groupsInList = new ArrayList<>();
        for (Organizations group : Organizations.values()) {
            if (enableTesting) {
                if (group != Organizations.TEST) continue;
            } else {
                if (group == Organizations.TEST) continue;
            }

            if (gameFilter == null || group.gamesList.contains(gameFilter)) {
                groupsInList.add(group);
            }
        }

        if (!groupsInList.isEmpty()) {
            items.add("Organizations"); // String as a simple header
            items.addAll(groupsInList);
        }
    }

    private void setupItemItems(boolean enableTesting, Games gameFilter, ItemGroups itemGroupFilter) {
        for (ItemGroups group : ItemGroups.values()) {
            if (enableTesting) {
                if (group != ItemGroups.TEST) continue;
            } else {
                if (group == ItemGroups.TEST) continue;
            }

            // If we are filtering by group, skip others
            if (itemGroupFilter != null && group != itemGroupFilter) continue;

            List<Object> itemsInGroup = new ArrayList<>();
            for (Items item : Items.values()) {
                if (item.itemGroup == group) {
                    if (gameFilter == null || item.gamesList.contains(gameFilter)) {
                        itemsInGroup.add(item);
                    }
                }
            }

            if (!itemsInGroup.isEmpty()) {
                items.add(group);
                items.addAll(itemsInGroup);
            }
        }
    }

    private void setupMapItems(boolean enableTesting, Games gameFilter) {
        List<Object> mapsInList = new ArrayList<>();
        for (StorylineMaps map : StorylineMaps.values()) {
            if (enableTesting) {
                if (map.game != Games.Test) continue;
            } else {
                if (map.game == Games.Test) continue;
            }

            if (gameFilter == null || map.game == gameFilter) {
                mapsInList.add(map);
            }
        }

        if (!mapsInList.isEmpty()) {
            items.add("Maps"); // Simple header
            items.addAll(mapsInList);
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
        return (item instanceof Player_CharacterGroups || item instanceof NonPlayer_CharacterGroups || item instanceof YoutuberGroups || item instanceof CreatureGroups || item instanceof ItemGroups || item instanceof String) ? TYPE_HEADER : TYPE_CHARACTER;
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
            if (item instanceof Player_CharacterGroups) {
                displayName = ((Player_CharacterGroups) item).displayName;
            } else if (item instanceof NonPlayer_CharacterGroups) {
                displayName = ((NonPlayer_CharacterGroups) item).displayName;
            } else if (item instanceof YoutuberGroups) {
                displayName = ((YoutuberGroups) item).displayName;
            } else if (item instanceof CreatureGroups) {
                displayName = ((CreatureGroups) item).name();
            } else if (item instanceof ItemGroups) {
                displayName = ((ItemGroups) item).displayName;
            } else if (item instanceof String) {
                displayName = (String) item;
            }
            ((HeaderViewHolder) holder).groupName.setText(displayName);

        } else if (holder instanceof CharacterViewHolder) {
            CharacterViewHolder charHolder = (CharacterViewHolder) holder;
            if (item instanceof IStorylineItems) {
                IStorylineItems character = (IStorylineItems) item;
                charHolder.pfpImage.setImageResource(character.GetImage());
                charHolder.nameText.setText(character.GetDisplayName());
                charHolder.itemView.setOnClickListener(v -> {
                    if (listener != null) {
                        if (character instanceof Player_Characters) {
                            listener.onPlayerCharacterClick((Player_Characters) character);
                        } else if (character instanceof NonPlayer_Characters) {
                            listener.onNonPlayerCharacterClick((NonPlayer_Characters) character);
                        } else if (character instanceof Enemy_Creatures) {
                            listener.onEnemyCreatureClick((Enemy_Creatures) character);
                        } else if (character instanceof Friendly_Creatures) {
                            listener.onFriendlyCreatureClick((Friendly_Creatures) character);
                        } else if (character instanceof Organizations) {
                            listener.onGroupClick((Organizations) character);
                        } else if (character instanceof Items) {
                            listener.onItemClick((Items) character);
                        } else if (character instanceof StorylineMaps) {
                            listener.onMapClick((StorylineMaps) character);
                        } else if (character instanceof CodZombies_Youtubers) {
                            listener.onYoutuberClick((CodZombies_Youtubers) character);
                        }
                    }
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
