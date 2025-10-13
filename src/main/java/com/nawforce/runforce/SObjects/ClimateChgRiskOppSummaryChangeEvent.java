/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ClimateChgRiskOppSummaryChangeEvent extends SObject {
	public static SObjectType$<ClimateChgRiskOppSummaryChangeEvent> SObjectType;
	public static SObjectFields$<ClimateChgRiskOppSummaryChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Decimal E1AstAcutMtrlPhyRiskClimateChg;
	public Decimal E1AstChrncMtrlPhyRiskClimate;
	public Decimal E1AstMtrlPhyRiskClimateChg;
	public Decimal E1AstMtrlTrnstRiskBefMitgAct;
	public Decimal E1CarrValRealEstAstEnrgyEfcy;
	public Decimal E1EstmtAmtPotStrandedAssets;
	public Decimal E1ExpcChgNetRevLowCarbonPrdct;
	public Decimal E1ExpcCostSavClimateChgAdpt;
	public Decimal E1ExpcCostSavClimateChgMitg;
	public Decimal E1GhgEmissionCostRate;
	public Decimal E1LiabMtrlTrnstRisksFinclStmt;
	public Decimal E1NbrEmssnAllowRptPeriod;
	public Decimal E1NbrScp1GhgEmssnTrdSchemes;
	public Decimal E1NetRevBusActvMtrlPhyRisk;
	public Decimal E1NetRevBusActvMtrlTranstRisk;
	public Decimal E1NetRevCoalRelatedActivities;
	public Decimal E1NetRevGasRelatedActivities;
	public Decimal E1NetRevOilRelatedActivities;
	public Decimal E1PctAstMtrlPhyRiskClimateChg;
	public Decimal E1PctAstMtrlRiskBefClimateChg;
	public Decimal E1PctAstMtrlTrnstRiskAddrMitg;
	public Decimal E1PctAstMtrlTrnstRiskBefMitg;
	public Decimal E1PctNetRevBusActvMtrlPhyRisk;
	public Decimal E1PctNetRevBusMtrlTranstRisk;
	public Decimal E1PctNetRevCoalRelatedActv;
	public Decimal E1PctNetRevGasRelatedActv;
	public Decimal E1PctNetRevOilRelatedActv;
	public Decimal E1PctStrandedAstMtrlTranstRisk;
	public Decimal E1PotFtrLiabCrbnCrCancFuture;
	public Decimal E1PotMktSizeLowCarbonProducts;
	public Decimal E1TotalAmountRealEstateAssets;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;

	public ClimateChgRiskOppSummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgRiskOppSummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgRiskOppSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgRiskOppSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgRiskOppSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
