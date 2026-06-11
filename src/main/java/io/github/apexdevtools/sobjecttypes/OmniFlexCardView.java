/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
