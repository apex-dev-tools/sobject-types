/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class CaseTeamMember extends SObject {
	public static SObjectType$<CaseTeamMember> SObjectType;
	public static SObjectFields$<CaseTeamMember> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MemberId;
	public Name Member;
	public Id ParentId;
	public Case Parent;
	public Datetime SystemModstamp;
	public Id TeamRoleId;
	public CaseTeamRole TeamRole;
	public Id TeamTemplateId;
	public CaseTeamTemplate TeamTemplate;
	public Id TeamTemplateMemberId;
	public CaseTeamTemplateMember TeamTemplateMember;

	public CaseTeamMember clone$() {throw new UnsupportedOperationException();}
	public CaseTeamMember clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public CaseTeamMember clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public CaseTeamMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public CaseTeamMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
