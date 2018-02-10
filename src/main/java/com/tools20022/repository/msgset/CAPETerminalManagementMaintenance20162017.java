/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msgset;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.catm.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This document describes the Card Payments Exchanges - Terminal Management
 * message set. It includes the new candidate versions of the MessageDefinitions
 * that have been impacted by the maintenance cycle 2016/2017 (MCR #120) and are
 * submitted to the approval of the Cards Standards Evaluation Group as ISO
 * 20022 MessageDefinitions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV02
 * MaintenanceDelegationResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.TerminalManagementRejectionV04
 * TerminalManagementRejectionV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementResponseV01
 * CertificateManagementResponseV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.CertificateManagementRequestV01
 * CertificateManagementRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catm.StatusReportV06
 * StatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV06
 * AcceptorConfigurationUpdateV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV03
 * MaintenanceDelegationRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV06
 * ManagementPlanReplacementV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CAPE - Terminal Management - Maintenance 2016 - 2017"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "This document describes the Card Payments Exchanges - Terminal Management message set. It includes the new candidate versions of the MessageDefinitions that have been impacted by the maintenance cycle 2016/2017 (MCR #120) and are submitted to the approval of the Cards Standards Evaluation Group as ISO 20022 MessageDefinitions."
 * </li>
 * </ul>
 */
public class CAPETerminalManagementMaintenance20162017 {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CAPE - Terminal Management - Maintenance 2016 - 2017";
				definition = "This document describes the Card Payments Exchanges - Terminal Management message set. It includes the new candidate versions of the MessageDefinitions that have been impacted by the maintenance cycle 2016/2017 (MCR #120) and are submitted to the approval of the Cards Standards Evaluation Group as ISO 20022 MessageDefinitions.";
				messageDefinition_lazy = () -> Arrays.asList(MaintenanceDelegationResponseV02.mmObject(), TerminalManagementRejectionV04.mmObject(), CertificateManagementResponseV01.mmObject(), CertificateManagementRequestV01.mmObject(),
						StatusReportV06.mmObject(), AcceptorConfigurationUpdateV06.mmObject(), MaintenanceDelegationRequestV03.mmObject(), ManagementPlanReplacementV06.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}