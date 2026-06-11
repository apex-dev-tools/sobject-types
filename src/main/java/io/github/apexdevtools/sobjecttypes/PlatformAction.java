/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PlatformAction extends SObject {
	public static SObjectType$<PlatformAction> SObjectType;
	public static SObjectFields$<PlatformAction> Fields;

	public String ActionListContext;
	public String ActionTarget;
	public String ActionTargetType;
	public String ApiName;
	public String Category;
	public String ConfirmationMessage;
	public String DeviceFormat;
	public String ExternalId;
	public Id GroupId;
	public SObject Group;
	public String IconContentType;
	public Integer IconHeight;
	public String IconUrl;
	public Integer IconWidth;
	public Id Id;
	public String InvocationStatus;
	public Id InvokedByUserId;
	public User InvokedByUser;
	public Boolean IsGroupDefault;
	public Boolean IsMassAction;
	public String Label;
	public Datetime LastModifiedDate;
	public String OpenType;
	public String PrimaryColor;
	public String RelatedListRecordId;
	public String RelatedSourceEntity;
	public String RetrievalMode;
	public String Section;
	public String SourceEntity;
	public String Subtype;
	public String TargetObject;
	public String TargetUrl;
	public String Type;

	public PlatformAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public PlatformAction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PlatformAction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PlatformAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PlatformAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
