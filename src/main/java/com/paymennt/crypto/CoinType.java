/**
 * Copyright (c) 2018 orogvany
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package com.paymennt.crypto;

import com.paymennt.crypto.bip32.wallet.key.Curve;

public enum CoinType {
    BITCOIN(Curve.BITCOIN, 0, false),
    SOLANA(Curve.ED25519, 501, true),
    SEMUX(Curve.ED25519, 7562605, true);

    private final Curve curve;
    private final long coinType;
    private boolean alwaysHardened;

    CoinType(Curve curve, long coinType, boolean alwaysHardened) {

        this.curve = curve;
        this.coinType = coinType;
        this.alwaysHardened = alwaysHardened;
    }

    /**
     * Get the curve
     *
     * @return curve
     */
    public Curve getCurve() {
        return curve;
    }

    /**
     * get the coin type
     *
     * @return coin type
     */
    public long getCoinType() {
        return coinType;
    }

    /**
     * get whether the addresses must always be hardened
     *
     * @return always hardened
     */
    public boolean getAlwaysHardened() {
        return alwaysHardened;
    }
}
