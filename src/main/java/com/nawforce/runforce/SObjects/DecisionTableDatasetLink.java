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
public class DecisionTableDatasetLink extends SObject {
	public static SObjectType$<DecisionTableDatasetLink> SObjectType;
	public static SObjectFields$<DecisionTableDatasetLink> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DecisionTableId;
	public DecisionTable DecisionTable;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String SetupName;
	public String SourceObject;
	public Datetime SystemModstamp;

	public DecisionTblDatasetParameter[] DecisionTableDatasetParameters;

	public DecisionTableDatasetLink clone$() {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableDatasetLink clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableDatasetLink clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableDatasetLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableDatasetLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
