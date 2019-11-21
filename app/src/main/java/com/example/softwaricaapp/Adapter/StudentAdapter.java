package com.example.softwaricaapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.softwaricaapp.Model.Student;
import com.example.softwaricaapp.R;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {


    private Context context;
    private List<Student> studentList;

    public StudentAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_std, parent, false);

        return new StudentViewHolder(view,context, studentList);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = studentList.get(position);
        holder.name.setText(student.getName());
        holder.address.setText(student.getAddress());
        holder.age.setText(student.getAge()+"");
        holder.gender.setText(student.getGender());
        holder.image.setImageResource(student.getImage());


    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name, age, address, gender;
        Context context;
        List<Student> list;
        ImageView delete;

        public StudentViewHolder(@NonNull View itemView, final Context context, final List<Student> studentList) {

            super(itemView);
            image = itemView.findViewById(R.id.IV_Image);
            name = itemView.findViewById(R.id.TV_Name);
            age = itemView.findViewById(R.id.TV_Age);
            address = itemView.findViewById(R.id.TV_Address);
            gender = itemView.findViewById(R.id.TV_Gender);
            delete = itemView.findViewById(R.id.Btn_Delete);
            this.context = context;
            this.list = studentList;

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Student std = list.get(getAdapterPosition());//this is array position
                    Toast.makeText(context, std.getName(), Toast.LENGTH_SHORT);
                }
            });

            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    list.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                }
            });


        }




}

}


