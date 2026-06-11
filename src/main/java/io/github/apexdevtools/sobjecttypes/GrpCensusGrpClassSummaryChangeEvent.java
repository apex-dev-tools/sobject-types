/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class GrpCensusGrpClassSummaryChangeEvent extends SObject {
	public static SObjectType$<GrpCensusGrpClassSummaryChangeEvent> SObjectType;
	public static SObjectFields$<GrpCensusGrpClassSummaryChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer FullTimeMemberCount;
	public Id GroupCensusId;
	public GroupCensus GroupCensus;
	public Id GroupClassId;
	public GroupClass GroupClass;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer MbrWithMoreThan1ChldCount;
	public Integer MbrWithMoreThan2ChldCount;
	public Integer MbrWithoutDependentCount;
	public Integer MemberOptOutCount;
	public Integer MemberWithDependentCount;
	public Integer MemberWithOneChildCount;
	public Integer MemberWithSpouseCount;
	public String Name;
	public Integer PartTimeMemberCount;
	public String ReplayId;
	public Integer TotalDependents;
	public Integer TotalMemberPlusDependent;
	public Integer TotalMembers;

	public GrpCensusGrpClassSummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusGrpClassSummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusGrpClassSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusGrpClassSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusGrpClassSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
