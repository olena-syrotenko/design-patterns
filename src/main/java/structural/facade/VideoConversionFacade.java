package structural.facade;

import structural.facade.complex_subsystem.AudioMixer;
import structural.facade.complex_subsystem.BitrateReader;
import structural.facade.complex_subsystem.Codec;
import structural.facade.complex_subsystem.VideoFile;

import java.io.File;

public class VideoConversionFacade {
	public File convertVideo(String fileName, String format) {
		System.out.println("VideoConversionFacade: conversion started.");
		VideoFile file = new VideoFile(fileName);
		Codec sourceCodec = file.getCodecType();
		Codec destinationCodec = Codec.getCodecByValue(format);
		VideoFile buffer = BitrateReader.read(file, sourceCodec);
		VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
		File result = (new AudioMixer()).fix(intermediateResult);
		System.out.println("VideoConversionFacade: conversion completed.");
		return result;
	}
}
