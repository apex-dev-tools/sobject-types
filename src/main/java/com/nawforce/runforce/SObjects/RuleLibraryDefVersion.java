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
public class RuleLibraryDefVersion extends SObject {
	public static SObjectType$<RuleLibraryDefVersion> SObjectType;
	public static SObjectFields$<RuleLibraryDefVersion> Fields;

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
	public Id RuleLibraryDefinitionId;
	public RuleLibraryDefinition RuleLibraryDefinition;
	public Datetime SystemModstamp;

	public RuleLibraryVersion[] RuleLibraryVersions;

	public RuleLibraryDefVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public RuleLibraryDefVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RuleLibraryDefVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RuleLibraryDefVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RuleLibraryDefVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
