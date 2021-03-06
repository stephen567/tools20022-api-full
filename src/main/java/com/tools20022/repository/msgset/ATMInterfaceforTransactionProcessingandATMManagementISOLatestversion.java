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
import com.tools20022.repository.area.caam.*;
import com.tools20022.repository.area.catp.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Messages that support any card related Automated Teller Machine (ATM)
 * transactions, card related terminal management services and services between
 * an ATM equipment and an ATM acquirer. These services include cash
 * withdrawals, kiosk functions and card account management transactions. It
 * includes the new candidate versions of the MessageDefinitions that have been
 * impacted by the unscheduled maintenance (CR #0533) and were approved by the
 * Cards Standards Evaluation Group as ISO 20022 MessageDefinitions on 6 April
 * 2016.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageSet#getMessageDefinition
 * messageDefinition} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01
 * HostToATMAcknowledgementV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.HostToATMRequestV01
 * HostToATMRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01
 * ATMExceptionAcknowledgementV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV02
 * ATMWithdrawalRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMExceptionAdviceV01
 * ATMExceptionAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV02
 * ATMReconciliationAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02
 * ATMReconciliationAcknowledgementV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMDepositResponseV01
 * ATMDepositResponseV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMDepositRequestV01
 * ATMDepositRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02
 * ATMWithdrawalCompletionAdviceV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMInquiryResponseV02
 * ATMInquiryResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01
 * ATMDepositCompletionAcknowledgementV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV02
 * ATMPINManagementRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01
 * ATMTransferRequestV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV02
 * ATMDiagnosticResponseV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV02
 * ATMDiagnosticRequestV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV02
 * ATMWithdrawalResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV02
 * ATMWithdrawalCompletionAcknowledgementV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV02
 * ATMPINManagementResponseV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01
 * ATMDepositCompletionAdviceV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMRejectV02
 * ATMRejectV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMInquiryRequestV02
 * ATMInquiryRequestV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV02
 * ATMCompletionAcknowledgementV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV02
 * ATMCompletionAdviceV02}</li>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMTransferResponseV01
 * ATMTransferResponseV01}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDeviceControlV03
 * ATMDeviceControlV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV03
 * ATMDeviceReportV03}</li>
 * <li>{@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadRequestV03
 * ATMKeyDownloadRequestV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV03
 * ATMKeyDownloadResponseV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelCatalogueEntry#getBusinessProcessCatalogue
 * businessProcessCatalogue} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#catalogue
 * GeneratedRepository.catalogue}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATM Interface for Transaction Processing and ATM Management - ISO - Latest version"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Messages that support any card related Automated Teller Machine (ATM) transactions, card related terminal management services and services between an ATM equipment and an ATM acquirer. These services include cash withdrawals, kiosk functions and card account management transactions. It includes the new candidate versions of the MessageDefinitions that have been impacted by the unscheduled maintenance (CR #0533) and were approved by the Cards Standards Evaluation Group as ISO 20022 MessageDefinitions on 6 April 2016."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion {

	final static private AtomicReference<MMMessageSet> mmObject_lazy = new AtomicReference<>();

	final static public MMMessageSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageSet() {
			{
				businessProcessCatalogue_lazy = () -> GeneratedRepository.catalogue;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATM Interface for Transaction Processing and ATM Management - ISO - Latest version";
				definition = "Messages that support any card related Automated Teller Machine (ATM) transactions, card related terminal management services and services between an ATM equipment and an ATM acquirer. These services include cash withdrawals, kiosk functions and card account management transactions. It includes the new candidate versions of the MessageDefinitions that have been impacted by the unscheduled maintenance (CR #0533) and were approved by the Cards Standards Evaluation Group as ISO 20022 MessageDefinitions on 6 April 2016.";
				messageDefinition_lazy = () -> Arrays.asList(HostToATMAcknowledgementV01.mmObject(), HostToATMRequestV01.mmObject(), ATMExceptionAcknowledgementV01.mmObject(), ATMWithdrawalRequestV02.mmObject(),
						ATMExceptionAdviceV01.mmObject(), ATMReconciliationAdviceV02.mmObject(), ATMReconciliationAcknowledgementV02.mmObject(), ATMDepositResponseV01.mmObject(), ATMDepositRequestV01.mmObject(),
						ATMWithdrawalCompletionAdviceV02.mmObject(), ATMInquiryResponseV02.mmObject(), ATMDepositCompletionAcknowledgementV01.mmObject(), ATMPINManagementRequestV02.mmObject(), ATMTransferRequestV01.mmObject(),
						ATMDiagnosticResponseV02.mmObject(), ATMDiagnosticRequestV02.mmObject(), ATMWithdrawalResponseV02.mmObject(), ATMWithdrawalCompletionAcknowledgementV02.mmObject(), ATMPINManagementResponseV02.mmObject(),
						ATMDepositCompletionAdviceV01.mmObject(), ATMRejectV02.mmObject(), ATMInquiryRequestV02.mmObject(), ATMCompletionAcknowledgementV02.mmObject(), ATMCompletionAdviceV02.mmObject(), ATMTransferResponseV01.mmObject(),
						ATMDeviceControlV03.mmObject(), ATMDeviceReportV03.mmObject(), ATMKeyDownloadRequestV03.mmObject(), ATMKeyDownloadResponseV03.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}