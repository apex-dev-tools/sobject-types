/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MemberBenefitChangeEvent extends SObject {
	public static SObjectType$<MemberBenefitChangeEvent> SObjectType;
	public static SObjectFields$<MemberBenefitChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id BenefitId;
	public Benefit Benefit;
	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MemberId;
	public LoyaltyProgramMember Member;
	public String Name;
	public String PrimaryRefObjectRecord;
	public String PrimaryRefObjectRecordTitle;
	public String ReplayId;
	public String SourceType;
	public Date StartDate;
	public String Status;

	public MemberBenefitChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MemberBenefitChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MemberBenefitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MemberBenefitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MemberBenefitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
