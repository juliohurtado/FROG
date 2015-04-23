package muffinc.frog.test.eigenface;

import org.ejml.data.DenseMatrix64F;

/**
 * FROG, a Face Recognition Gallery in Java
 * Copyright (C) 2015 Jun Zhou
 * <p/>
 * This file is part of FROG.
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * zj45499 (at) gmail (dot) com
 */
public class FrogEigenfaceImpl implements FrogEigenface {
    DenseMatrix64F imageMatrix;

    public FrogEigenfaceImpl(DenseMatrix64F imageMatrix) {
        this.imageMatrix = imageMatrix;
    }

    @Override
    public void addTrainingFace(Face aFace) {

    }

    @Override
    public void removeTrainingFace(Face aFace) {

    }

    @Override
    public TrainingFaces getTrainingFaces() {
        return null;
    }

    @Override
    public Face identifyFace(Face aFace) {
        return null;
    }
}