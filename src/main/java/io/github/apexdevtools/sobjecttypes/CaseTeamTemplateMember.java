/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class CaseTeamTemplateMember extends SObject {
	public static SObjectType$<CaseTeamTemplateMember> SObjectType;
	public static SObjectFields$<CaseTeamTemplateMember> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MemberId;
	public SObject Member;
	public Datetime SystemModstamp;
	public Id TeamRoleId;
	public CaseTeamRole TeamRole;
	public Id TeamTemplateId;
	public CaseTeamTemplate TeamTemplate;

	public CaseTeamTemplateMember clone$() {throw new java.lang.UnsupportedOperationException();}
	public CaseTeamTemplateMember clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CaseTeamTemplateMember clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CaseTeamTemplateMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CaseTeamTemplateMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
