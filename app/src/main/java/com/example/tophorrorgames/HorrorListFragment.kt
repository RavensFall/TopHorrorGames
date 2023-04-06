package com.example.tophorrorgames

import android.content.ClipData.Item
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tophorrorgames.databinding.ActivityMainBinding
import com.example.tophorrorgames.databinding.FragmentHorrorListBinding

class HorrorListFragment : Fragment(R.layout.fragment_horror_list) {
    val adapter = HorrorAdapter(getData()){MoreDetails(it)}
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding=FragmentHorrorListBinding.bind(view)
        binding.recyclerView.adapter = adapter
        val layoutManager = LinearLayoutManager(context)
        binding.recyclerView.layoutManager = layoutManager

    }
    fun MoreDetails(itemHorror: ItemHorror){
        findNavController().navigate(HorrorListFragmentDirections.actionHorrorListFragmentToHorrorInfoFragment(itemHorror))
    }
    fun getData():List<ItemHorror>{
        return listOf(
            ItemHorror(
                "https://assetsio.reedpopcdn.com/alien-isolation-best-horror-games.jpg?width=690&quality=70&format=jpg&auto=webp",
                "Alien Isolation", "2014", "9/10", "PC, PS4, Xbox One", "Creative Assembly, Feral Interactive", "Alien Isolation is the 2014 sci-fi horror adapted from Ridley Scott’s iconic 1979 film, Alien. In the game, you find yourself in the claustrophobic environment of a trading station floating in space, with Xenomorph in pursuit of you. As Amanda, Ripley’s daughter, your mission is to not only stay alive, but to also try and find out what happened to your mother when she vanished 15 years ago.",
        ),
            ItemHorror("https://assetsio.reedpopcdn.com/dead-space-best-horror-games.jpg?width=690&quality=70&format=jpg&auto=webp",
                "Dead Space","2008", "9.9/10","PC, PS3, Xbox 360, Xbox One", "Visceral Games (previously known as Redwood Shores)", "Dead Space is a 2008 survival horror video game developed by EA Redwood Shores and published by Electronic Arts. It was released for PlayStation 3, Xbox 360, and Microsoft Windows as the debut entry in the Dead Space series. Set on a mining spaceship overrun by deadly monsters called Necromorphs following the discovery of an artifact called the Marker, the player controls engineer Isaac Clarke as he navigates the spaceship and fights the Necromorphs while struggling with growing psychosis. Gameplay has Isaac exploring different areas through its narrative, solving environmental puzzles and finding ammunition and equipment to survive."),
            ItemHorror("https://image.api.playstation.com/vulcan/img/rnd/202010/2818/CengOdzyOMCxhvq422tHBsJS.png","Until Dawn","2015","9/10", "PC (via PSN), PS4", "Supermassive Games", "Until Dawn is a 2015 interactive drama horror video game developed by Supermassive Games and published by Sony Computer Entertainment for the PlayStation 4. Players assume control of eight young adults who have to survive on Blackwood Mountain when their lives are threatened. The game features a butterfly effect system in which players must make choices that may change the story. All playable characters can survive or die, depending on the choices made. Players explore the environment from a third-person perspective and find clues that may help solve the mystery."),
            ItemHorror("https://image.api.playstation.com/vulcan/ap/rnd/202203/3115/MwaHx2whbBEuhPIpXzMtijrv.jpg", "Little Nightmares", "2017", "9/10", " PC, PS4, Xbox One","Tarsier Studios, Supermassive Games", "Little Nightmares is a puzzle-platform horror adventure game developed by Tarsier Studios and published by Bandai Namco Entertainment for PlayStation 4, Windows and Xbox One. A Nintendo Switch version was released in May 2018, followed by a Google Stadia version in June 2020 and then a mobile version will be released at winter 2023 and published by Playdigious. Set in a mysterious world, Little Nightmares follows the journey of Six, a hungry little girl who must escape the Maw, an iron vessel inhabited by monstrous, twisted beings. The game received positive reviews upon release with critics praising its atmosphere, graphics, and sound while criticizing its checkpoint system and a short length. A prequel, Little Nightmares II, was released in February 2021."),
            ItemHorror("https://upload.wikimedia.org/wikipedia/ru/thumb/3/3f/Prey_%282017_video_game%29.jpg/411px-Prey_%282017_video_game%29.jpg","Prey", "2017", "8.9/10","PC, PS4, Xbox One","Arkane Studios Austin", "Prey is a first-person shooter video game developed by Arkane Austin and published by Bethesda Softworks. It was released worldwide on 5 May 2017, for PlayStation 4, Windows, and Xbox One.The game takes place in an alternate timeline in which an accelerated Space Race resulted in humankind taking to orbital stations far earlier. The player controls Morgan Yu while exploring the space station Talos I, in orbit around Earth–Moon L2, where they were part of a scientific team researching the Typhon, a hostile alien force composed of many forms with both physical and psychic powers, such as shapeshifting into a clone of any inanimate object. As the Typhon escape confinement, the player uses a variety of weapons and abilities, some of which are derived from the Typhon themselves, to avoid being killed while looking to escape the station. The player gains access to areas of the station by acquiring key items and abilities, eventually allowing the player to explore the station in an open world setting. The game combines elements of role-playing video games, stealth games, immersive sims and Metroidvanias in its design."),
            ItemHorror("https://upload.wikimedia.org/wikipedia/en/a/aa/Outlast_cover.jpg","Outlast","2013","8/10", "PC, PS4, Xbox One","Red Barrels", "Outlast is a 2013 first-person survival horror video game developed and published by Red Barrels. The game revolves around a freelance investigative journalist, Miles Upshur, who decides to investigate a remote psychiatric hospital named Mount Massive Asylum, located deep in the mountains of Lake County, Colorado. The downloadable content Outlast: Whistleblower centers on Waylon Park, the man who led Miles there in the first place."),

        )
    }




}