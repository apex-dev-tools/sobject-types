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
public class EmbeddedServiceDetail extends SObject {
	public static SObjectType$<EmbeddedServiceDetail> SObjectType;
	public static SObjectFields$<EmbeddedServiceDetail> Fields;

	public String AvatarImg;
	public String ContrastInvertedColor;
	public String ContrastPrimaryColor;
	public String CustomMinimizedComponent;
	public String CustomPrechatComponent;
	public String DurableId;
	public String FieldServiceConfirmCardImg;
	public String FieldServiceHomeImg;
	public String FieldServiceLogoImg;
	public String Font;
	public String FontSize;
	public Integer Height;
	public Id Id;
	public Boolean IsFieldServiceEnabled;
	public Boolean IsLiveAgentEnabled;
	public Boolean IsOfflineCaseEnabled;
	public Boolean IsPrechatEnabled;
	public Boolean IsQueuePositionEnabled;
	public String NavBarColor;
	public String NavBarTextColor;
	public String OfflineCaseBackgroundImg;
	public String PrechatBackgroundImg;
	public String PrimaryColor;
	public String SecondaryColor;
	public String SecondaryNavBarColor;
	public Boolean ShouldHideAuthDialog;
	public Boolean ShouldShowExistingAppointment;
	public Boolean ShouldShowNewAppointment;
	public String Site;
	public String SmallCompanyLogoImg;
	public String WaitingStateBackgroundImg;
	public Integer Width;

	public EmbeddedServiceDetail clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmbeddedServiceDetail clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmbeddedServiceDetail clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmbeddedServiceDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmbeddedServiceDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
