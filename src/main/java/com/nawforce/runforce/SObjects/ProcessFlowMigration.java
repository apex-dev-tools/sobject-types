/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ProcessFlowMigration extends SObject {
	public static SObjectType$<ProcessFlowMigration> SObjectType;
	public static SObjectFields$<ProcessFlowMigration> Fields;

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
	public String MigratedCriteriaLabel;
	public String MigratedCriteriaName;
	public String NamespacePrefix;
	public Datetime SystemModstamp;

	public ProcessFlowMigration clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcessFlowMigration clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcessFlowMigration clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcessFlowMigration clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcessFlowMigration clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
