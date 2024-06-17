/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DuplicateJobDefinition extends SObject {
	public static SObjectFields$<DuplicateJobDefinition> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String SobjectSubtype;
	public String SobjectType;
	public Datetime SystemModstamp;

	public DuplicateJobMatchingRuleDefinition[] DuplicateJobMatchingRuleDefinitions;
	public DuplicateJob[] DuplicateJobs;

	public DuplicateJobDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public DuplicateJobDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DuplicateJobDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DuplicateJobDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DuplicateJobDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
