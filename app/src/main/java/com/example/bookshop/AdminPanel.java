package com.example.bookshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class AdminPanel extends AppCompatActivity {

    final static int PICK_PDF_CODE = 2342;

    Button uploadBtn, uploadQtnBtn;
    TextView textViewStatus;
    EditText editTextFilename, editTextPathname;
    ProgressBar progressBar;

    StorageReference mStorageReference;
    DatabaseReference mDatabaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);

        uploadBtn = findViewById(R.id.uploadBtnId);
        uploadQtnBtn = findViewById(R.id.uploadQtnBtnId);
        textViewStatus = findViewById(R.id.textViewStatusId);
        editTextFilename = findViewById(R.id.editTxtPDFnmId);
        editTextPathname = findViewById(R.id.editTxtSemId);
        progressBar = findViewById(R.id.progressbarHHId);






        uploadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String path = editTextPathname.getText().toString();
                String sem1 = "one";
                String sem2 = "two";
                String sem3 = "three";
                String sem4 = "four";
                String sem5 = "five";
                String sem6 = "six";
                String sem7 = "seven";
                String sem8 = "eight";
                String sem9 = "nine";
                String sem10 = "ten";
                String sem11 = "eleven";
                String sem12 = "twelve";
                if (path.equals(sem1)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS1);
                    getPDF();
                }
                else if (path.equals(sem2)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS2);
                    getPDF();
                }
                else if (path.equals(sem3)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS3);
                    getPDF();
                }
                else if (path.equals(sem4)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS4);
                    getPDF();
                }
                else if  (path.equals(sem5)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS5);
                    getPDF();
                }
                else if (path.equals(sem6)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS6);
                    getPDF();
                }
                else if (path.equals(sem7)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS7);
                    getPDF();
                }
                else if (path.equals(sem8)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS8);
                    getPDF();
                }
                else if (path.equals(sem9)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS9);
                    getPDF();
                }
                else if (path.equals(sem10)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS10);
                    getPDF();
                }
                else if (path.equals(sem11)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS11);
                    getPDF();
                }
                else if (path.equals(sem12)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS12);
                    getPDF();
                }
                else
                {
                    Toast.makeText(AdminPanel.this, "Enter valid Semester name!!(one/two/three....)", Toast.LENGTH_LONG).show();
                }
            }
        });




        uploadQtnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String path = editTextPathname.getText().toString();
                String sem1 = "one";
                String sem2 = "two";
                String sem3 = "three";
                String sem4 = "four";
                String sem5 = "five";
                String sem6 = "six";
                String sem7 = "seven";
                String sem8 = "eight";
                String sem9 = "nine";
                String sem10 = "ten";
                String sem11 = "eleven";
                String sem12 = "twelve";
                if (path.equals(sem1)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS1);
                    getPDF();
                }
                else if (path.equals(sem2)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS2);
                    getPDF();
                }
                else if (path.equals(sem3)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS3);
                    getPDF();
                }
                else if (path.equals(sem4)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS4);
                    getPDF();
                }
                else if  (path.equals(sem5)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS5);
                    getPDF();
                }
                else if (path.equals(sem6)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS6);
                    getPDF();
                }
                else if (path.equals(sem7)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS7);
                    getPDF();
                }
                else if (path.equals(sem8)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS8);
                    getPDF();
                }
                else if (path.equals(sem9)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS9);
                    getPDF();
                }
                else if (path.equals(sem10)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS10);
                    getPDF();
                }
                else if (path.equals(sem11)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS11);
                    getPDF();
                }
                else if (path.equals(sem12)){
                    mStorageReference = FirebaseStorage.getInstance().getReference();
                    mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS12);
                    getPDF();
                }
                else
                {
                    Toast.makeText(AdminPanel.this, "Enter valid Semester name!!(one/two/three....)", Toast.LENGTH_LONG).show();
                }
            }
        });






    }

    private void getPDF() {
        Intent intent = new Intent();
        intent.setType("application/pdf");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select PDF"), PICK_PDF_CODE);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_PDF_CODE && resultCode == RESULT_OK && data != null && data.getData() != null) {
            if (data.getData() != null) {
                uploadFile(data.getData());
            }else{
                Toast.makeText(this, "No file chosen", Toast.LENGTH_SHORT).show();
            }
        }
    }



    private void uploadFile(Uri data) {

        if(editTextFilename.getText().equals(null)){

            Toast.makeText(AdminPanel.this, "Please Enter PDF Name", Toast.LENGTH_LONG).show();

        }
        else
        {
            progressBar.setVisibility(View.VISIBLE);


            StorageReference sRef = mStorageReference.child(ValueForSemester.STORAGE_PATH_UPLOADS1 + System.currentTimeMillis() + ".pdf");
            sRef.putFile(data)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @SuppressWarnings("VisibleForTests")
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            progressBar.setVisibility(View.GONE);
                            textViewStatus.setText("File Uploaded Successfully");
                            Task<Uri> uriTask = taskSnapshot.getStorage().getDownloadUrl();
                            while (!uriTask.isComplete());
                            Uri uri = uriTask.getResult();

                            Upload upload = new Upload(editTextFilename.getText().toString(), uri.toString());
                            mDatabaseReference.child(mDatabaseReference.push().getKey()).setValue(upload);
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception exception) {
                            Toast.makeText(getApplicationContext(), exception.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    })
                    .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                        @SuppressWarnings("VisibleForTests")
                        @Override
                        public void onProgress(UploadTask.TaskSnapshot taskSnapshot) {
                            double progress = (100.0 * taskSnapshot.getBytesTransferred()) / taskSnapshot.getTotalByteCount();
                            textViewStatus.setText((int) progress + "% uploading....");
                        }
                    });

        }


    }
}
