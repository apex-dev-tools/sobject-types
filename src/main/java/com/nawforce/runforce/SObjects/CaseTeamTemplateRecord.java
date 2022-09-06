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
public class CaseTeamTemplateRecord extends SObject {
	public static SObjectType$<CaseTeamTemplateRecord> SObjectType;
	public static SObjectFields$<CaseTeamTemplateRecord> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id ParentId;
	public Case Parent;
	public Datetime SystemModstamp;
	public Id TeamTemplateId;
	public CaseTeamTemplate TeamTemplate;

	public CaseTeamTemplateRecord clone$() {throw new UnsupportedOperationException();}
	public CaseTeamTemplateRecord clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public CaseTeamTemplateRecord clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public CaseTeamTemplateRecord clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public CaseTeamTemplateRecord clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
