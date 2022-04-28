// spring boot + JAP
// �f�[�^�x�[�X�փA�N�Z�X���邽�߂�Repository�N���X
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

/**
 * ���[�U�[��� Repository
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}