/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CoverageBenefitItemChangeEvent extends SObject {
	public static SObjectType$<CoverageBenefitItemChangeEvent> SObjectType;
	public static SObjectFields$<CoverageBenefitItemChangeEvent> Fields;

	public String BenefitCategory;
	public Object ChangeEventHeader;
	public Id CodeSetServiceTypeId;
	public CodeSet CodeSetServiceType;
	public Id CoverageBenefitId;
	public CoverageBenefit CoverageBenefit;
	public String CoverageLevel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Boolean DoesDeductibleApply;
	public Id Id;
	public String InNetworkCoverage;
	public Boolean IsActive;
	public Boolean IsInPlanNetwork;
	public Boolean IsPreauthorizationRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MemberId;
	public Account Member;
	public String Name;
	public String Notes;
	public String OutofNetworkCoverage;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String ServiceType;
	public String ServiceTypeCode;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String TimePeriod;

	public CoverageBenefitItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
