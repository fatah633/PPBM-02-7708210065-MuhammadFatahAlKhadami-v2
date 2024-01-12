package com.example.muhammadfatahalkhadami
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2;
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return GenreFragment()
            }
            1 -> {
                return ArtistFragment()
            }
            else -> {
                return GenreFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "GENRE"
            }
            1 -> {
                return "ARTIST"
            }
        }
        return super.getPageTitle(position)
    }
}