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
public class BiodiversitySummaryChangeEvent extends SObject {
	public static SObjectType$<BiodiversitySummaryChangeEvent> SObjectType;
	public static SObjectFields$<BiodiversitySummaryChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Decimal E4AntcpFinclEffMaterialRisks;
	public Decimal E4AreaCvInvasiveAlienSpecies;
	public Decimal E4DirIdirCostsBiodiversityOfst;
	public Decimal E4NatureOrientedAreaOffSite;
	public Decimal E4NatureOrientedAreaOnSite;
	public Decimal E4NbrSiteOwnLsdMngBiodiversity;
	public Decimal E4NbrSiteOwnLsdMngPrtcAreas;
	public Decimal E4NumberInvasiveAlienSpecies;
	public Decimal E4TotalSealedArea;
	public Decimal E4TotalUseLand;
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

	public BiodiversitySummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BiodiversitySummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BiodiversitySummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BiodiversitySummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BiodiversitySummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
