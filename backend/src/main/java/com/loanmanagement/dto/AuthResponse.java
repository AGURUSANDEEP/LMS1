package com.loanmanagement.dto;

import com.loanmanagement.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
    private String token;
    private User.Role role;
    
//  TODO: To be implemented by Vandana

}
