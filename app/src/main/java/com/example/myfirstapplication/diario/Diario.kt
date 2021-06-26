package com.example.myfirstapplication.diario
/*
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import es.dmoral.toasty.Toasty;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.projectnotes.R;
import com.example.projectnotes.adapters.NotesListAdapter;
import com.example.projectnotes.componentBd.ComponentNotes;
import com.example.projectnotes.hash.Sha;
import com.example.projectnotes.pojos.Note;
import com.example.projectnotes.pojos.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
/**
 * Pantalla donde se cargan todas las notas
 */
public class Diario(contentLayoutId: Int) : AppCompatActivity(contentLayoutId) {
    //Objetos de la interfaz
    private ListView listViewNotes;
    private EditText editTextSearch;
    private ComponentNotes componentNotes;          //Objeto que nos permite realizar las operaciones con la BDD
    private ArrayList<Note> listNotes;              //ArrayList que contendrá todas las notas de la BDD
    private int alphabeticalOrder = 1;              //Variable que controla el orden alfabetico
    private final String SHA = "SHA-1";             //Constante que guarda el tipo de hash
    public static boolean isPermission;             //Variable que controla los permisos
    public static boolean isUpdate;                 //Variable que controla si hacemos un update o insert en el EditTextActivity
    /**
     * Se crea la interfaz del activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        fillListView();
        //Indicamos que el editTextSearch este pendiente del boton ENTER del teclado del usuario
        editTextSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    performSearch();
                    return true;
                }
                return false;
            }
        });
        //Cuando se selecciona un item del ListView mostramos una ventana de dialogo
        listViewNotes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Note note = (Note) listViewNotes.getItemAtPosition(i);
                showAlertDialog(note);
            }
        });
        if (validatePermissions()) {
            isPermission = true;
        } else {
            isPermission = false;
        }
    }
    /**
     * Inicializamos los objetos de la interfaz, el objeto de la BDD y isUpdate
     */


 */