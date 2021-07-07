package com.sumit.recyclerviw;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder  extends RecyclerView.ViewHolder {

private TextView mTvName;
    private TextView mTvage;
    private TextView mTvRollNo;

    public StudentViewHolder(@NonNull  View itemView) {
        super(itemView);
        initView(itemView);

    }


    private void initView(View itemView) {
        mTvName  = itemView.findViewById(R.id.tvName);
        mTvage  = itemView.findViewById(R.id.tvAge);
        mTvRollNo = itemView.findViewById(R.id.tvRollNo);

    }
    public void setData(Student student){
        mTvName.setText(student.getName());
        mTvage.setText(student.getAge()+"");
        mTvRollNo.setText(student.getRollNo());
    }
}
