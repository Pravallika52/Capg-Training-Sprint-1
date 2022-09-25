package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Ailment;
import com.example.demo.exception.AilmentNotFoundException;



public interface IAilmentService {
	Ailment addAilment(Ailment ailment);
	Ailment deleteAilmentById(int ailmentId) throws AilmentNotFoundException;
	Ailment updateAilment(int ailmentId, Ailment ailment) throws AilmentNotFoundException;
	List<Ailment> getAllAilments();
}