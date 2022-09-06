/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class BriefcaseAssignmentChangeEvent extends SObject {
	public static SObjectType$<BriefcaseAssignmentChangeEvent> SObjectType;
	public static SObjectFields$<BriefcaseAssignmentChangeEvent> Fields;

	public Id BriefcaseId;
	public BriefcaseDefinition Briefcase;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ReplayId;
	public Id UserOrGroupId;
	public SObject UserOrGroup;

	public BriefcaseAssignmentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BriefcaseAssignmentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BriefcaseAssignmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BriefcaseAssignmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BriefcaseAssignmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
