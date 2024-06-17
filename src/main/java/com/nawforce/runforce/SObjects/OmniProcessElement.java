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
public class OmniProcessElement extends SObject {
	public static SObjectType$<OmniProcessElement> SObjectType;
	public static SObjectFields$<OmniProcessElement> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String DesignerCustomizationType;
	public String DiscoveryFrameworkUsageType;
	public String EmbeddedOmniScriptKey;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsOmniScriptEmbeddable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Level;
	public String Name;
	public Id OmniProcessId;
	public OmniProcess OmniProcess;
	public Decimal OmniProcessVersionNumber;
	public Id ParentElementId;
	public OmniProcessElement ParentElement;
	public String ParentElementName;
	public String ParentElementType;
	public String PropertySetConfig;
	public Decimal SequenceNumber;
	public Datetime SystemModstamp;
	public String Type;

	public OmniProcessElement[] ChildElements;

	public OmniProcessElement clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniProcessElement clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniProcessElement clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniProcessElement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniProcessElement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
