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
public class ActionLinkTemplate extends SObject {
	public static SObjectType$<ActionLinkTemplate> SObjectType;
	public static SObjectFields$<ActionLinkTemplate> Fields;

	public Id ActionLinkGroupTemplateId;
	public ActionLinkGroupTemplate ActionLinkGroupTemplate;
	public com.nawforce.runforce.System.String ActionUrl;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String Headers;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsConfirmationRequired;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsGroupDefault;
	public com.nawforce.runforce.System.String Label;
	public com.nawforce.runforce.System.String LabelKey;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LinkType;
	public com.nawforce.runforce.System.String Method;
	public com.nawforce.runforce.System.Integer Position;
	public com.nawforce.runforce.System.String RequestBody;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String UserAlias;
	public com.nawforce.runforce.System.String UserVisibility;

	public ActionLinkTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActionLinkTemplate clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActionLinkTemplate clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActionLinkTemplate clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActionLinkTemplate clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
