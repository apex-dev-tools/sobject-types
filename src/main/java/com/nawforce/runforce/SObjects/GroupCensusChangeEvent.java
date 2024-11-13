/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class GroupCensusChangeEvent extends SObject {
	public static SObjectType$<GroupCensusChangeEvent> SObjectType;
	public static SObjectFields$<GroupCensusChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EffectiveEndDate;
	public Datetime EffectiveStartDate;
	public String ExternalIdentifier;
	public Integer FullTimeMemberCount;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LeadId;
	public Lead Lead;
	public Integer MbrWithMoreThan1ChldCount;
	public Integer MbrWithMoreThan2ChldCount;
	public Integer MbrWithoutDependentCount;
	public Integer MemberOptOutCount;
	public Integer MemberWithDependentCount;
	public Integer MemberWithOneChildCount;
	public Integer MemberWithSpouseCount;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Integer PartTimeMemberCount;
	public String ReplayId;
	public String SourceSystemName;
	public String SourceSystemType;
	public String Status;
	public Integer TotalDependents;
	public Integer TotalMemberPlusDependent;
	public Integer TotalMembers;
	public String Type;
	public String UsageType;

	public GroupCensusChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
