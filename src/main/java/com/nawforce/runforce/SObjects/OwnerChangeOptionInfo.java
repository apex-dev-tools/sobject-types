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
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class OwnerChangeOptionInfo extends SObject {
	public static SObjectType$<OwnerChangeOptionInfo> SObjectType;
	public static SObjectFields$<OwnerChangeOptionInfo> Fields;

	public com.nawforce.runforce.System.Boolean DefaultValue;
	public com.nawforce.runforce.System.String DurableId;
	public com.nawforce.runforce.System.String EntityDefinitionId;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsEditable;
	public com.nawforce.runforce.System.String Label;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String ParentId;

	public OwnerChangeOptionInfo[] ChildOwnerChangeOptionInfo;

	public OwnerChangeOptionInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public OwnerChangeOptionInfo clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OwnerChangeOptionInfo clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OwnerChangeOptionInfo clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OwnerChangeOptionInfo clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
