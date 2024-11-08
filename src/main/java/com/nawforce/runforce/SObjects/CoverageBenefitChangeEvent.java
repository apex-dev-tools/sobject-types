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
public class CoverageBenefitChangeEvent extends SObject {
	public static SObjectType$<CoverageBenefitChangeEvent> SObjectType;
	public static SObjectFields$<CoverageBenefitChangeEvent> Fields;

	public String BenefitNotes;
	public Date BenefitPeriodEndDate;
	public Date BenefitPeriodStartDate;
	public Id CareBenefitVerifyRequestId;
	public CareBenefitVerifyRequest CareBenefitVerifyRequest;
	public Object ChangeEventHeader;
	public String CoinsuranceNotes;
	public String CopayNotes;
	public String CoverageType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DeductibleNotes;
	public String Disclaimer;
	public String Division;
	public Decimal EmergencyDepartmentCopay;
	public Decimal FamilyInNetworkDeductibleApplied;
	public Decimal FamilyInNetworkDeductibleLimit;
	public Decimal FamilyInNetworkDeductibleRemaining;
	public Decimal FamilyInNetworkOutofPocketApplied;
	public Decimal FamilyInNetworkOutofPocketLimit;
	public Decimal FamilyInNetworkOutofPocketRemaining;
	public Decimal FamilyOutofNetworkDeductibleApplied;
	public Decimal FamilyOutofNetworkDeductibleLimit;
	public Decimal FamilyOutofNetworkDeductibleRemaining;
	public Decimal FamilyOutofNetworkOutofPocketApplied;
	public Decimal FamilyOutofNetworkOutofPocketLimit;
	public Decimal FamilyOutofNetworkOutofPocketRemaining;
	public Id FinalCoverageStatusCodeId;
	public CodeSet FinalCoverageStatusCode;
	public Id Id;
	public Decimal InNetworkCoinsuranceAmount;
	public Decimal InNetworkCoinsurancePercentage;
	public Decimal InNetworkLifetimeMaximum;
	public Decimal IndividualInNetworkDeductibleApplied;
	public Decimal IndividualInNetworkDeductibleLimit;
	public Decimal IndividualInNetworkDeductibleRemaining;
	public Decimal IndividualInNetworkOutofPocketApplied;
	public Decimal IndividualInNetworkOutofPocketLimit;
	public Decimal IndividualInNetworkOutofPocketRemaining;
	public Decimal IndividualOutofNetworkDeductibleApplied;
	public Decimal IndividualOutofNetworkDeductibleLimit;
	public Decimal IndividualOutofNetworkDeductibleRemain;
	public Decimal IndividualOutofNetworkOutofPocketApplied;
	public Decimal IndividualOutofNetworkOutofPocketLimit;
	public Decimal IndividualOutofNetworkOutofPocketRemain;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LifetimeMaximumNotes;
	public Id MemberId;
	public Account Member;
	public Id MemberPlanId;
	public MemberPlan MemberPlan;
	public String Name;
	public Id OutcomeStatusCodeId;
	public CodeSet OutcomeStatusCode;
	public Decimal OutofNetworkCoinsuranceAmount;
	public Decimal OutofNetworkCoinsurancePercentage;
	public Decimal OutofNetworkLifetimeMaximum;
	public String OutofPocketNotes;
	public Id OwnerId;
	public User Owner;
	public Decimal PharmaCopayAmount;
	public Decimal PrimaryCareCopay;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Decimal SpecialistCopay;
	public Id StatusCodeId;
	public CodeSet StatusCode;
	public Decimal UrgentCareCopay;
	public Datetime VerificationDate;

	public CoverageBenefitChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CoverageBenefitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
