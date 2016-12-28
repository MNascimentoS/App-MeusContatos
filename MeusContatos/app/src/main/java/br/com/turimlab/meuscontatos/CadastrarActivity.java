package br.com.turimlab.meuscontatos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastrarActivity extends AppCompatActivity implements View.OnClickListener{
    EditText Nome;
    EditText Endereco;
    EditText Telefone;
    EditText Email;
    Button Cadastrar;
    Button Cancelar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrar_contato);
        Cadastrar = (Button) findViewById(R.id.cadastrar);
        Cadastrar.setOnClickListener(this);
        Cancelar = (Button) findViewById(R.id.cancelar);
        Cancelar.setOnClickListener(this);
        Nome = (EditText) findViewById(R.id.nome);
        Endereco = (EditText) findViewById(R.id.endereco);
        Telefone = (EditText) findViewById(R.id.telefone);
        Email = (EditText) findViewById(R.id.email);
    }

    @Override
    public void onClick(View view) {
        if (view == Cadastrar){
            cadastrar();
        }else if (view == Cancelar){
            finish();
        }
    }

    private void cadastrar() {
        Contato novo_contato;
        novo_contato = new Contato( Nome.getText().toString(),     Endereco.getText().toString(),
                                    Telefone.getText().toString(), Email.getText().toString()     );
    }
}
