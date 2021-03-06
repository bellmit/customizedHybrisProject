/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.backend.impl.erp.strategy;

import de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.backend.interf.erp.strategy.GetAllStrategy;
import de.hybris.platform.sap.sapordermgmtbol.transaction.salesdocument.backend.interf.erp.strategy.LrdActionsStrategy;

/**
 * Implementation for ERP 605 of StrategyFactoryERP. <br>
 * 
 * @see StrategyFactoryERP
 * @version 1.0
 */
public class StrategyFactoryERP605 extends StrategyFactoryERP {

    @Override
    public GetAllStrategy createGetAllStrategy() {
        return new GetAllStrategyERP605();
    }

    @Override
    public LrdActionsStrategy createLrdActionsStrategy() {
        return new LrdActionsStrategyERP605();
    }

}
