// spring boot + JAP
// ��̓I�ȏ������L�q����Service�N���X
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

/**
 * ���[�U�[��� Service
 */
@Service
public class UserService {

    /**
     * ���[�U�[��� Repository
     */
    @Autowired
    UserRepository userRepository;

    public List<User> searchAll() {
        // ���[�U�[TBL�̓��e��S����
        return userRepository.findAll();
    }
}