/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OmniFlexCardView extends SObject {
	public static SObjectType$<OmniFlexCardView> SObjectType;
	public static SObjectFields$<OmniFlexCardView> Fields;

	public String Author;
	public String CurrencyIsoCode;
	public String Description;
	public String ExternalId;
	public String FlexcardName;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsChildCard;
	public Boolean IsFileBased;
	public Boolean IsManagedUsingStdDesigner;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OmniUiCardId;
	public OmniUiCard OmniUiCard;
	public Integer VersionCount;
	public Decimal VersionNumber;

	public OmniFlexCardView clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniFlexCardView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniFlexCardView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniFlexCardView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniFlexCardView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
