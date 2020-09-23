package com.suwian.springcloud.entities;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    /**
     * 主键ID
     */
    @TableId
    private Long id;

    /**
     *
     */
    private String serial;

    public Payment(String serial) {
        this.serial = serial;
    }

    private static final long serialVersionUID = 1L;
}

