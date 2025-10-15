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
public class PltnImpactRiskOppSummaryChangeEvent extends SObject {
	public static SObjectType$<PltnImpactRiskOppSummaryChangeEvent> SObjectType;
	public static SObjectFields$<PltnImpactRiskOppSummaryChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Decimal E2AmountSbstncCncrnHazardCls;
	public Decimal E2AmountSbstncCncrnProcured;
	public Decimal E2AmtSbstncCncrnEmssnHazardCls;
	public Decimal E2AmtSbstncCncrnEmssnPrdct;
	public Decimal E2AmtSbstncCncrnPartPrdctHzrd;
	public Decimal E2AmtSbstncCncrnPrdctHazardCls;
	public Decimal E2AmtSbstncCncrnSrvcsHazardCls;
	public Decimal E2AmtSbstncHighCncrnEmssnHzrd;
	public Decimal E2AmtSbstncHighCncrnPartHzrd;
	public Decimal E2AmtSbstncHighCncrnPrdctHzrd;
	public Decimal E2AmtSbstncHighCncrnSrvcsHzrd;
	public Decimal E2AntcpFinclEffMaterialRisks;
	public Decimal E2CptlExpIncidentsDeposits;
	public Decimal E2EmissionsAirPollutant;
	public Decimal E2EmissionsSoilPollutant;
	public Decimal E2EmissionsWaterPollutant;
	public Decimal E2OpExpIncidentsDeposits;
	public Decimal E2PctEmssnPolutSoilWtrRisk;
	public Decimal E2PctEmssnPolutSoilWtrStrss;
	public Decimal E2PctEmssnPolutWtrAreaWtrRisk;
	public Decimal E2PctEmssnPolutWtrAreaWtrStrss;
	public Decimal E2PctNetRevSrvcsSbstncCncrn;
	public Decimal E2PctNetRevSvcSbstncHighCncrn;
	public Decimal E2PrvsnEnvrPrtcRemediationCost;
	public Decimal E2TotSbstncHighCncrnGenHzrdCls;
	public Decimal E2TotSbstncHighCncrnPrdctHzrd;
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

	public PltnImpactRiskOppSummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PltnImpactRiskOppSummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PltnImpactRiskOppSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PltnImpactRiskOppSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PltnImpactRiskOppSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
