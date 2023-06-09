// Generated by view binder compiler. Do not edit!
package ni.edu.uca.sistematicopersistencia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ni.edu.uca.sistematicopersistencia.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnGuardar;

  @NonNull
  public final Button btnLimpiar;

  @NonNull
  public final EditText etCantidadExist;

  @NonNull
  public final EditText etNombre;

  @NonNull
  public final EditText etPrecio;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnGuardar,
      @NonNull Button btnLimpiar, @NonNull EditText etCantidadExist, @NonNull EditText etNombre,
      @NonNull EditText etPrecio) {
    this.rootView = rootView;
    this.btnGuardar = btnGuardar;
    this.btnLimpiar = btnLimpiar;
    this.etCantidadExist = etCantidadExist;
    this.etNombre = etNombre;
    this.etPrecio = etPrecio;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnGuardar;
      Button btnGuardar = ViewBindings.findChildViewById(rootView, id);
      if (btnGuardar == null) {
        break missingId;
      }

      id = R.id.btnLimpiar;
      Button btnLimpiar = ViewBindings.findChildViewById(rootView, id);
      if (btnLimpiar == null) {
        break missingId;
      }

      id = R.id.etCantidadExist;
      EditText etCantidadExist = ViewBindings.findChildViewById(rootView, id);
      if (etCantidadExist == null) {
        break missingId;
      }

      id = R.id.etNombre;
      EditText etNombre = ViewBindings.findChildViewById(rootView, id);
      if (etNombre == null) {
        break missingId;
      }

      id = R.id.etPrecio;
      EditText etPrecio = ViewBindings.findChildViewById(rootView, id);
      if (etPrecio == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnGuardar, btnLimpiar,
          etCantidadExist, etNombre, etPrecio);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
