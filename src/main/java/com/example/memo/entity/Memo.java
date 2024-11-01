package com.example.memo.entity;

import com.example.memo.dto.MemoRequestDto;
import com.example.memo.dto.MemoResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Memo {

    private long id;
    private String title;
    private String contents;

    public void update(MemoRequestDto dto) {
        this.title = dto.getTitle();
        this.contents = dto.getContents();
    }

    public void updateTitle(MemoRequestDto dto) {
        this.title = dto.getTitle();
    }

    public void updateContents(MemoRequestDto dto) {
        this.title = dto.getContents();
    }
}
