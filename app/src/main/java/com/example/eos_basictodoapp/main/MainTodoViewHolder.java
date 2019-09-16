package com.example.eos_basictodoapp.main;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eos_basictodoapp.R;
import com.example.eos_basictodoapp.data.entity.TodoItem;

public class MainTodoViewHolder extends RecyclerView.ViewHolder {

    private TextView todo_tv_title;
    private CheckBox todo_cb;

    public MainTodoViewHolder(@NonNull View itemView) {
        super(itemView);

        todo_tv_title = itemView.findViewById(R.id.todo_tv_title);
        todo_cb = itemView.findViewById(R.id.todo_cb);
    }

    public void onBind(TodoItem item) {
            // onBind에서는 텍스트뷰와 체크여부를 설정할 거
        todo_tv_title.setText(item.getTitle());
        // 그러면 내가 받아온 타이틀의 텍스트대로 텍스트를 세트하겠다
        todo_cb.setChecked(item.getChecked());
        // 내가 입력한대로 체크를 할지 안 할지 여부를 판단하겠다

    }
}
