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
public class WebLink extends SObject {
	public static SObjectType$<WebLink> SObjectType;
	public static SObjectFields$<WebLink> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String DisplayType;
	public com.nawforce.runforce.System.String EncodingKey;
	public com.nawforce.runforce.System.Boolean HasMenubar;
	public com.nawforce.runforce.System.Boolean HasScrollbars;
	public com.nawforce.runforce.System.Boolean HasToolbar;
	public com.nawforce.runforce.System.Integer Height;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsProtected;
	public com.nawforce.runforce.System.Boolean IsResizable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LinkType;
	public com.nawforce.runforce.System.String MasterLabel;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String NamespacePrefix;
	public com.nawforce.runforce.System.String OpenType;
	public com.nawforce.runforce.System.String PageOrSobjectType;
	public com.nawforce.runforce.System.String Position;
	public com.nawforce.runforce.System.Boolean RequireRowSelection;
	public Id ScontrolId;
	public SObject Scontrol;
	public com.nawforce.runforce.System.Boolean ShowsLocation;
	public com.nawforce.runforce.System.Boolean ShowsStatus;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Url;
	public com.nawforce.runforce.System.Integer Width;

	public WebLinkLocalization[] Localization;

	public WebLink clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebLink clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebLink clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebLink clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebLink clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
