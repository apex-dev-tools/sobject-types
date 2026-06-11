/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class GroupCensusChangeEvent extends SObject {
	public static SObjectType$<GroupCensusChangeEvent> SObjectType;
	public static SObjectFields$<GroupCensusChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Object ChangeEventHeader;
	public Id ContractId;
	public Contract Contract;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EffectiveDate;
	public Datetime EffectiveEndDate;
	public Datetime EffectiveStartDate;
	public Date ExpirationDate;
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
