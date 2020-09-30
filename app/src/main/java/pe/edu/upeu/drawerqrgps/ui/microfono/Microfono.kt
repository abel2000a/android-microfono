package pe.edu.upeu.drawerqrgps.ui.microfono

import android.Manifest
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import pe.edu.upeu.drawerqrgps.ui.microfono.MicrofonoViewModel
import pe.edu.upeu.drawerqrgps.R

class microfono : Fragment() {

    companion object {
        fun newInstance() = microfono()

    }

    private lateinit var viewModel: MicrofonoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.microfono_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MicrofonoViewModel::class.java)
        // TODO: Use the ViewModel
    }
}