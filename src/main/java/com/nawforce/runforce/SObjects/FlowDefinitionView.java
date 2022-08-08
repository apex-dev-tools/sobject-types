/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FlowDefinitionView extends SObject {
	public static SObjectType$<FlowDefinitionView> SObjectType;
	public static SObjectFields$<FlowDefinitionView> Fields;

	public com.nawforce.runforce.System.String ActiveVersionId;
	public com.nawforce.runforce.System.String ApiName;
	public com.nawforce.runforce.System.String Builder;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String DurableId;
	public Id Id;
	public com.nawforce.runforce.System.String InstalledPackageName;
	public com.nawforce.runforce.System.Boolean IsActive;
	public com.nawforce.runforce.System.Boolean IsOutOfDate;
	public com.nawforce.runforce.System.Boolean IsSwingFlow;
	public com.nawforce.runforce.System.Boolean IsTemplate;
	public com.nawforce.runforce.System.String Label;
	public com.nawforce.runforce.System.String LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LatestVersionId;
	public com.nawforce.runforce.System.String ManageableState;
	public com.nawforce.runforce.System.String NamespacePrefix;
	public com.nawforce.runforce.System.String ProcessType;
	public com.nawforce.runforce.System.Integer TriggerOrder;
	public com.nawforce.runforce.System.String TriggerType;

	public FlowVersionView[] Versions;

	public FlowDefinitionView clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowDefinitionView clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowDefinitionView clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowDefinitionView clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowDefinitionView clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
