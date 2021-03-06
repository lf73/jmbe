package jmbe.codec.ambe;

import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;

/**
 * AMBE tones enumeration
 */
public enum Tone
{
    T5(5, "156.25", 5.0 * 31.25, 0.0),
    T6(6, "187.50", 6.0 * 31.25, 0.0),
    T7(7, "218.75", 7.0 * 31.25, 0.0),
    T8(8, "250.00", 8.0 * 31.25, 0.0),
    T9(9, "281.25", 9.0 * 31.25, 0.0),
    T10(10, "312.50", 10.0 * 31.25, 0.0),
    T11(11, "343.75", 11.0 * 31.25, 0.0),
    T12(12, "375.00", 12.0 * 31.25, 0.0),
    T13(13, "406.25", 13.0 * 31.25, 0.0),
    T14(14, "437.50", 14.0 * 31.25, 0.0),
    T15(15, "468.75", 15.0 * 31.25, 0.0),
    T16(16, "500.00", 16.0 * 31.25, 0.0),
    T17(17, "531.25", 17.0 * 31.25, 0.0),
    T18(18, "562.50", 18.0 * 31.25, 0.0),
    T19(19, "593.75", 19.0 * 31.25, 0.0),
    T20(20, "625.00", 20.0 * 31.25, 0.0),
    T21(21, "656.25", 21.0 * 31.25, 0.0),
    T22(22, "687.5", 22.0 * 31.25, 0.0),
    T23(23, "718.75", 23.0 * 31.25, 0.0),
    T24(24, "750.00", 24.0 * 31.25, 0.0),
    T25(25, "781.25", 25.0 * 31.25, 0.0),
    T26(26, "812.50", 26.0 * 31.25, 0.0),
    T27(27, "843.75", 27.0 * 31.25, 0.0),
    T28(28, "875.00", 28.0 * 31.25, 0.0),
    T29(29, "906.25", 29.0 * 31.25, 0.0),
    T30(30, "937.50", 30.0 * 31.25, 0.0),
    T31(31, "968.75", 31.0 * 31.25, 0.0),
    T32(32, "1000.00", 32.0 * 31.25, 0.0),
    T33(33, "1031.25", 33.0 * 31.25, 0.0),
    T34(34, "1062.50", 34.0 * 31.25, 0.0),
    T35(35, "1093.75", 35.0 * 31.25, 0.0),
    T36(36, "1125.00", 36.0 * 31.25, 0.0),
    T37(37, "1156.25", 37.0 * 31.25, 0.0),
    T38(38, "1187.50", 38.0 * 31.25, 0.0),
    T39(39, "1218.75", 39.0 * 31.25, 0.0),
    T40(40, "1250.00", 40.0 * 31.25, 0.0),
    T41(41, "1281.25", 41.0 * 31.25, 0.0),
    T42(42, "1312.50", 42.0 * 31.25, 0.0),
    T43(43, "1343.75", 43.0 * 31.25, 0.0),
    T44(44, "1375.00", 44.0 * 31.25, 0.0),
    T45(45, "1406.25", 45.0 * 31.25, 0.0),
    T46(46, "1437.50", 46.0 * 31.25, 0.0),
    T47(47, "1468.75", 47.0 * 31.25, 0.0),
    T48(48, "1500.00", 48.0 * 31.25, 0.0),
    T49(49, "1531.25", 49.0 * 31.25, 0.0),
    T50(50, "1562.50", 50.0 * 31.25, 0.0),
    T51(51, "1593.75", 51.0 * 31.25, 0.0),
    T52(52, "1625.00", 52.0 * 31.25, 0.0),
    T53(53, "1656.25", 53.0 * 31.25, 0.0),
    T54(54, "1687.50", 54.0 * 31.25, 0.0),
    T55(55, "1718.75", 55.0 * 31.25, 0.0),
    T56(56, "1750.00", 56.0 * 31.25, 0.0),
    T57(57, "1781.25", 57.0 * 31.25, 0.0),
    T58(58, "1812.50", 58.0 * 31.25, 0.0),
    T59(59, "1843.75", 59.0 * 31.25, 0.0),
    T60(60, "1875.00", 60.0 * 31.25, 0.0),
    T61(61, "1906.25", 61.0 * 31.25, 0.0),
    T62(62, "1937.50", 62.0 * 31.25, 0.0),
    T63(63, "1968.75", 63.0 * 31.25, 0.0),
    T64(64, "2000.00", 64.0 * 31.25, 0.0),
    T65(65, "2031.25", 65.0 * 31.25, 0.0),
    T66(66, "2062.50", 66.0 * 31.25, 0.0),
    T67(67, "2093.75", 67.0 * 31.25, 0.0),
    T68(68, "2125.00", 68.0 * 31.25, 0.0),
    T69(69, "2156.25", 69.0 * 31.25, 0.0),
    T70(70, "2187.50", 70.0 * 31.25, 0.0),
    T71(71, "2218.75", 71.0 * 31.25, 0.0),
    T72(72, "2250.00", 72.0 * 31.25, 0.0),
    T73(73, "2281.25", 73.0 * 31.25, 0.0),
    T74(74, "2312.50", 74.0 * 31.25, 0.0),
    T75(75, "2343.75", 75.0 * 31.25, 0.0),
    T76(76, "2375.00", 76.0 * 31.25, 0.0),
    T77(77, "2406.25", 77.0 * 31.25, 0.0),
    T78(78, "2437.50", 78.0 * 31.25, 0.0),
    T79(79, "2468.75", 79.0 * 31.25, 0.0),
    T80(80, "2500.00", 80.0 * 31.25, 0.0),
    T81(81, "2531.25", 81.0 * 31.25, 0.0),
    T82(82, "2562.50", 82.0 * 31.25, 0.0),
    T83(83, "2593.75", 83.0 * 31.25, 0.0),
    T84(84, "2625.00", 84.0 * 31.25, 0.0),
    T85(85, "2656.25", 85.0 * 31.25, 0.0),
    T86(86, "2687.50", 86.0 * 31.25, 0.0),
    T87(87, "2718.75", 87.0 * 31.25, 0.0),
    T88(88, "2750.00", 88.0 * 31.25, 0.0),
    T89(89, "2781.25", 89.0 * 31.25, 0.0),
    T90(90, "2812.50", 90.0 * 31.25, 0.0),
    T91(91, "2843.75", 91.0 * 31.25, 0.0),
    T92(92, "2875.00", 92.0 * 31.25, 0.0),
    T93(93, "2906.25", 93.0 * 31.25, 0.0),
    T94(94, "2937.50", 94.0 * 31.25, 0.0),
    T95(95, "2968.75", 95.0 * 31.25, 0.0),
    T96(96, "3000.00", 96.0 * 31.25, 0.0),
    T97(97, "3031.25", 97.0 * 31.25, 0.0),
    T98(98, "3062.50", 98.0 * 31.25, 0.0),
    T99(99, "3093.75", 99.0 * 31.25, 0.0),
    T100(100, "3125.00", 100.0 * 31.25, 0.0),
    T101(101, "3156.25", 101.0 * 31.25, 0.0),
    T102(102, "3187.50", 102.0 * 31.25, 0.0),
    T103(103, "3218.75", 103.0 * 31.25, 0.0),
    T104(104, "3250.00", 104.0 * 31.25, 0.0),
    T105(105, "3281.25", 105.0 * 31.25, 0.0),
    T106(106, "3312.50", 106.0 * 31.25, 0.0),
    T107(107, "3343.75", 107.0 * 31.25, 0.0),
    T108(108, "3375.00", 108.0 * 31.25, 0.0),
    T109(109, "3406.25", 109.0 * 31.25, 0.0),
    T110(110, "3437.50", 110.0 * 31.25, 0.0),
    T111(111, "3468.75", 111.0 * 31.25, 0.0),
    T112(112, "3500.00", 112.0 * 31.25, 0.0),
    T113(113, "3531.25", 113.0 * 31.25, 0.0),
    T114(114, "3562.50", 114.0 * 31.25, 0.0),
    T115(115, "3593.75", 115.0 * 31.25, 0.0),
    T116(116, "3625.00", 116.0 * 31.25, 0.0),
    T117(117, "3656.25", 117.0 * 31.25, 0.0),
    T118(118, "3687.50", 118.0 * 31.25, 0.0),
    T119(119, "3718.75", 119.0 * 31.25, 0.0),
    T120(120, "3750.00", 120.0 * 31.25, 0.0),
    T121(121, "3781.25", 121.0 * 31.25, 0.0),
    T122(122, "3812.50", 122.0 * 31.25, 0.0),
    T128_DTMF_0(128, "0", 1336.0, 941.0),
    T129_DTMF_1(129, "1", 1209.0, 697.0),
    T130_DTMF_2(130, "2", 1336.0, 697.0),
    T131_DTMF_3(131, "3", 1477.0, 697.0),
    T132_DTMF_4(132, "4", 1209.0, 770.0),
    T133_DTMF_5(133, "5", 1336.0, 770.0),
    T134_DTMF_6(134, "6", 1477.0, 770.0),
    T135_DTMF_7(135, "7", 1209.0, 852.0),
    T136_DTMF_8(136, "8", 1336.0, 852.0),
    T137_DTMF_9(137, "9", 1477.0, 852.0),
    T138_DTMF_A(138, "A", 1633.0, 697.0),
    T139_DTMF_B(139, "B", 1633.0, 770.0),
    T140_DTMF_C(140, "C", 1633.0, 852.0),
    T141_DTMF_D(141, "D", 1633.0, 941.0),
    T142_DTMF_STAR(142, "*", 1209.0, 941.0),
    T143_DTMF_POUND(143, "#", 1477.0, 941.0),
    T144_KNOX_0(144, "0", 1162.0, 820.0),
    T145_KNOX_1(145, "1", 1052.0, 606.0),
    T146_KNOX_2(146, "2", 1162.0, 606.0),
    T147_KNOX_3(147, "3", 1279.0, 606.0),
    T148_KNOX_4(148, "4", 1052.0, 672.0),
    T149_KNOX_5(149, "5", 1162.0, 672.0),
    T150_KNOX_6(150, "6", 1279.0, 672.0),
    T151_KNOX_7(151, "7", 1052.0, 743.0),
    T152_KNOX_8(152, "8", 1162.0, 743.0),
    T153_KNOX_9(153, "9", 1279.0, 743.0),
    T154_KNOX_A(154, "A", 1430.0, 606.0),
    T155_KNOX_B(155, "B", 1430.0, 672.0),
    T156_KNOX_C(156, "C", 1430.0, 743.0),
    T157_KNOX_D(157, "D", 1430.0, 820.0),
    T158_KNOX_STAR(158, "*", 1052.0, 820.0),
    T159_KNOX_POUND(159, "#", 1279.0, 820.0),
    T160(160, "DIAL TONE", 440.0, 350.0),
    T161(161, "RINGING TONE", 480.0, 440.0),
    T162(162, "BUSY TONE", 620.0, 480.0),
    T163(163, "CALL PROGRESS", 490.0, 350.0),
    INVALID(-1, "INVALID", 0.0, 0.0);

    private int mValue;
    private String mLabel;
    private double mFrequency1;
    private double mFrequency2;

    private static Map<Integer,Tone> sLOOKUP_MAP = new TreeMap<>();

    static
    {
        for(Tone tone: Tone.values())
        {
            sLOOKUP_MAP.put(tone.mValue, tone);
        }
    }

    /**
     * Constructs a tone entry
     * @param label for the tone
     * @param frequency1 value
     * @param frequency2 value
     */
    Tone(int value, String label, double frequency1, double frequency2)
    {
        mValue = value;
        mLabel = label;
        mFrequency1 = frequency1;
        mFrequency2 = frequency2;
    }

    public static EnumSet<Tone> DISCRETE_TONES = EnumSet.range(Tone.T5, Tone.T122);
    public static EnumSet<Tone> DTMF_TONES = EnumSet.range(Tone.T128_DTMF_0, Tone.T143_DTMF_POUND);
    public static EnumSet<Tone> KNOX_TONES = EnumSet.range(Tone.T144_KNOX_0, Tone.T159_KNOX_POUND);
    public static EnumSet<Tone> CALL_PROGRESS_TONES = EnumSet.range(Tone.T160, Tone.T163);

    @Override
    public String toString()
    {
        return mLabel;
    }

    /**
     * Frequency 1 in Hertz
     */
    public double getFrequency1()
    {
        return mFrequency1;
    }

    /**
     * Frequency 2 in Hertz
     */
    public double getFrequency2()
    {
        return mFrequency2;
    }

    /**
     * Indicates if the enumeration entry has a non-zero frequency 2 value
     */
    public boolean hasFrequency2()
    {
        return mFrequency2 > 0.0;
    }

    /**
     * Lookup method to find the tone matching the value in the range 0 - 163
     */
    public static Tone fromValue(int value)
    {
        Tone tone = sLOOKUP_MAP.get(value);

        if(tone == null)
        {
            tone = Tone.INVALID;
        }

        return tone;
    }
}
