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
public class PlatformAction extends SObject {
	public static SObjectType$<PlatformAction> SObjectType;
	public static SObjectFields$<PlatformAction> Fields;

	public com.nawforce.runforce.System.String ActionListContext;
	public com.nawforce.runforce.System.String ActionTarget;
	public com.nawforce.runforce.System.String ActionTargetType;
	public com.nawforce.runforce.System.String ApiName;
	public com.nawforce.runforce.System.String Category;
	public com.nawforce.runforce.System.String ConfirmationMessage;
	public com.nawforce.runforce.System.String DeviceFormat;
	public com.nawforce.runforce.System.String ExternalId;
	public Id GroupId;
	public SObject Group;
	public com.nawforce.runforce.System.String IconContentType;
	public com.nawforce.runforce.System.Integer IconHeight;
	public com.nawforce.runforce.System.String IconUrl;
	public com.nawforce.runforce.System.Integer IconWidth;
	public Id Id;
	public com.nawforce.runforce.System.String InvocationStatus;
	public Id InvokedByUserId;
	public User InvokedByUser;
	public com.nawforce.runforce.System.Boolean IsGroupDefault;
	public com.nawforce.runforce.System.Boolean IsMassAction;
	public com.nawforce.runforce.System.String Label;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String OpenType;
	public com.nawforce.runforce.System.String PrimaryColor;
	public com.nawforce.runforce.System.String RelatedListRecordId;
	public com.nawforce.runforce.System.String RelatedSourceEntity;
	public com.nawforce.runforce.System.String RetrievalMode;
	public com.nawforce.runforce.System.String Section;
	public com.nawforce.runforce.System.String SourceEntity;
	public com.nawforce.runforce.System.String Subtype;
	public com.nawforce.runforce.System.String TargetObject;
	public com.nawforce.runforce.System.String TargetUrl;
	public com.nawforce.runforce.System.String Type;

	public PlatformAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public PlatformAction clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PlatformAction clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PlatformAction clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PlatformAction clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
