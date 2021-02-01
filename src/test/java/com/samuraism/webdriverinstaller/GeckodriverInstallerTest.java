package com.samuraism.webdriverinstaller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeckodriverInstallerTest {

    @Test
    void getGeckoDriverVersionFromFirefoxVersion(){
        // Firefox 60+:  0.29.0
        assertEquals("v0.29.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("60.1"));
        assertEquals("v0.29.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("68.0b14"));
        assertEquals("v0.29.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("70.2"));
        assertEquals("v0.29.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("78.6.1esr"));
        assertEquals("v0.29.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("80"));
        assertEquals("v0.29.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("85.0"));
        assertEquals("v0.29.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("80.5"));
        assertEquals("v0.29.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("90.1.1"));

        // Firefox 57+: 0.25.0
        assertEquals("v0.25.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("57"));
        assertEquals("v0.25.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("57.1"));
        assertEquals("v0.25.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("58.0"));
        assertEquals("v0.25.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("58.2"));
        assertEquals("v0.25.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("59.1.1"));
        assertEquals("v0.25.0", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("59.5"));


        // Other: 0.20.1
        assertEquals("v0.20.1", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("37.1"));
        assertEquals("v0.20.1", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("38.2"));
        assertEquals("v0.20.1", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("39.5"));
        assertEquals("v0.20.1", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("47"));
        assertEquals("v0.20.1", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("55.0"));
        assertEquals("v0.20.1", GeckodriverInstaller.getGeckoDriverVersionFromFirefoxVersion("56.1.1"));

    }
}