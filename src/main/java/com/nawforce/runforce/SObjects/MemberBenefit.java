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
public class MemberBenefit extends SObject {
	public static SObjectType$<MemberBenefit> SObjectType;
	public static SObjectFields$<MemberBenefit> Fields;

	public Id AccountId;
	public Account Account;
	public Id BenefitId;
	public Benefit Benefit;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MemberId;
	public LoyaltyProgramMember Member;
	public String Name;
	public String PrimaryRefObjectRecord;
	public String PrimaryRefObjectRecordTitle;
	public String SourceType;
	public Date StartDate;
	public String Status;
	public Datetime SystemModstamp;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public MemberBenefitHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public MemberBenefit clone$() {throw new java.lang.UnsupportedOperationException();}
	public MemberBenefit clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MemberBenefit clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MemberBenefit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MemberBenefit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
