package com.spring.demo.msmail.service;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.spring.demo.msmail.dto.UserDto;
import com.spring.demo.msmail.entity.Mail;
import com.spring.demo.msmail.repository.MailRepository;
import com.sun.deploy.security.CertStore;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmailServiceImpl implements EmailService {

    private final MailRepository mailRepository;
    private final JavaMailSender emailSender;

    @Override
    public void sendSimpleMessage(UserDto input) {
        try {
            Mail newMail = new Mail();
            newMail.setTo(input.getUserName());
            newMail.setSubject("TestSubject");
            newMail.setText("TestText");

            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(newMail.getTo());
            message.setSubject(newMail.getSubject());
            message.setText(newMail.getText());

            mailRepository.save(newMail);
            emailSender.send(message);
        } catch (MailException exception) {
            exception.printStackTrace();
        }
    }
}
